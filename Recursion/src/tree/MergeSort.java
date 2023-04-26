package tree;
import java.util.*;
class Solution
{
	void sort(int arr[],int l,int r)
	{
		if(l<r)
		{
			int m=l+(r-l)/2;
			sort(arr,l,m);
			sort(arr,m+1,r);
			merge(arr,l,m,r);
		}
	void merge(int arr[],int l,int m,int r)
	{
		System.out.print(" ");
	}
}
public class MergeSort {

}
