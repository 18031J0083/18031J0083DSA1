
public class MergeSort {
	int array[];
	int tempMergeArray[];
	int length;
	public static void main(String[] args) {
		int Arr[]= {12,65,98,14,3,8,582};
		MergeSort ms=new MergeSort();
		ms.Sort(Arr);
		for (int i : Arr) {
			System.out.print(i+"  ");
		}
	}
		public void Sort(int[] Arr)
		{
			this.array=Arr;
			this.length=Arr.length;
			this.tempMergeArray=new int[length];
			divideArray(0,length-1);
		}
		public void divideArray(int lowerIndex,int higherIndex)
		{
			if(lowerIndex<higherIndex)
			{
				int middle=lowerIndex+(higherIndex-lowerIndex)/2;
				//it will sort the left hand side of an array
				divideArray(lowerIndex,middle);
				//it will sort the right hand side of an array
				divideArray(middle+1,higherIndex);
				MergeArray(lowerIndex,middle,higherIndex);
			}
		}
		public void MergeArray(int lowerIndex,int middle,int higherIndex)
		{
			for(int i=lowerIndex;i<=higherIndex;i++)
			{
				tempMergeArray[i]=array[i];
			}
			int i=lowerIndex;
			int j=middle+1;
			int k=lowerIndex;
			while(i<=middle && j<=higherIndex)
			{
				if(tempMergeArray[i]<=tempMergeArray[j])
				{
					array[k]=tempMergeArray[i];
					i++;
				}
				else
				{
					array[k]=tempMergeArray[j];
					j++;
				}
				k++;
			}
			while(i<=middle)
			{
				array[k]=tempMergeArray[i];
				k++;
				i++;
			}
		}
}
