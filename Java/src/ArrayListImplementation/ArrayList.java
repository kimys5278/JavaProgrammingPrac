package ArrayListImplementation;

public class ArrayList {
	//size -> 데이터가 몇개나 추가 되었는지 확인하기위해 0부터 시작.
	private int size = 0;
	private Object[] elementData = new Object[100];
	
	public boolean addfirst(Object element) {	
		return add(0,element);
	}
	
	public boolean addLast(Object element) {
		elementData[size] = element;
		size++;
		return true;
	}
	
	public boolean add(int index,Object element) {
		for(int i = size-1;i>=index;i--) {
			elementData[i+1]=elementData[i];
		}
		elementData[index] = element;
		size++;
		return true;
	}
	
	public String toString() {
		String str = "[";
		for(int i =0; i<size;i++) {
			str += elementData[i];
			if(i< size-1) {
				//마지막 ,는 지운다 
				str +=",";			
			}
		}
		return str + "]";
	}
	
	public Object remove(int index) {
		Object removed = elementData[index];
		for(int i =index+1;i<=size-1;i++) {
			elementData[i-1]=elementData[i];
			}	
		size--;
		elementData[size] = null;
		return removed;
	}
	 
	public Object removedFirst() {
		return remove(0);
	}
	
	public Object removedLast() {
		return remove(size-1);
	}
	
	public Object get(int index) {
		return elementData[index];
	}
	
	public int size() {
		return size;
	}
	
	public int indexOf(Object o) {
		for(int i =0; i<size; i++) {
			if(o.equals(elementData[i])) {
				return i;
			}
		}
		return -1;
	}
	
	public ListIterator listIterator() {	
		return new ListIterator();
	}
	
	class ListIterator{
		private int nextIndex = 0;
		
		public Object next() {
//			Object returnData = elementData[nextIndex];
//			nextIndex++;
//			return returnData;
			
			//위코드와 동일함
			return elementData[nextIndex++];
		}
		public boolean hasNext() {
			return nextIndex < size();
		}
		
		public Object previous() {
			return elementData[--nextIndex];
		}
		
		public boolean hasprevious() {
			return nextIndex > 0;
		}
		
		public void add(Object element) {
			ArrayList.this.add(nextIndex++,element);
		}
		
		public void remove() {
			ArrayList.this.remove(nextIndex-1);
			nextIndex--;
		}

	}
	
}


