package SmartWaaterGrid;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.io.BufferedReader;
import java.io.IOException;

public class SmartWaterGridCrowlling {
    public static void main(String[] args) throws IOException {
        // 발급받은 서비스 키를 여기에 입력
        String serviceKey = "t4qIXl80rNp79%2BIgYFzT6%2BuQKsTvPy%2FtRk0dLme2q6BbGfz2EZ3Ou3KGIVPBMtNVtGDP5JOy39HfBf%2Fgyr2B%2Fw%3D%3D";

        StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/5080000/frlndUswtrSuplyFcltyService/getFrlndUswtrSuplyFclty"); /*URL*/
        urlBuilder.append("?" + URLEncoder.encode("serviceKey", "UTF-8") + "=" + serviceKey); /*Service Key*/
        urlBuilder.append("&" + URLEncoder.encode("pageNo", "UTF-8") + "=" + URLEncoder.encode("2", "UTF-8")); /*페이지 번호*/
        URL url = new URL(urlBuilder.toString());
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-type", "application/json");
        System.out.println("Response code: " + conn.getResponseCode());
        BufferedReader rd;
        if (conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream(),StandardCharsets.UTF_8));
        } else {
            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream(),StandardCharsets.UTF_8));
        }
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            sb.append(line);
        }
        rd.close();
        conn.disconnect();
        System.out.println(sb.toString());
    }
}
