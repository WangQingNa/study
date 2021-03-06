package com.soap.common_util.sorter.sort;


import com.soap.common_util.sorter.SortUtil;

/**
 * @author treeroot
 * @since 2006-2-2
 * @version 1.0
 */
public class ImprovedQuickSort extends Swap implements SortUtil.Sort {

    private static int MAX_STACK_SIZE=4096;
    private static int THRESHOLD=10;
    /* (non-Javadoc)
     * @see org.rut.util.algorithm.SortUtil.Sort#sort(int[])
     */
    public void sort(int[] data) {
        int[] stack=new int[MAX_STACK_SIZE];

        int top=-1;
        int pivot;
        int pivotIndex,l,r;

        stack[++top]=0;
        stack[++top]=data.length-1;

        while(top>0){
            int j=stack[top--];
            int i=stack[top--];

            pivotIndex=(i+j)/2;
            pivot=data[pivotIndex];

            swap(data,pivotIndex,j);

            //partition
            l=i-1;
            r=j;
            do{
                while(data[++l]<pivot);
                while((r!=0)&&(data[--r]>pivot));
                swap(data,l,r);
            }
            while(l<r);
            swap(data,l,r);
            swap(data,l,j);

            if((l-i)>THRESHOLD){
                stack[++top]=i;
                stack[++top]=l-1;
            }
            if((j-l)>THRESHOLD){
                stack[++top]=l+1;
                stack[++top]=j;
            }

        }
        //new InsertSort().sort(data);
        insertSort(data);
    }
    /**
     * @param data
     */
    private void insertSort(int[] data) {
        for(int i=1;i<data.length;i++){
            for(int j=i;(j>0)&&(data[j]<data[j-1]);j--){
                swap(data,j,j-1);
            }
        }
    }

}
