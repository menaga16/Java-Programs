/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package placement_training;

/**
 *
 * @author menag
 */
public class partition {
    
    private int[] array;
    private int[][] partitions;
    private int partitionsize;

    public partition(int[] array,int partitionSize) {
        this.array=array;
        this.partitionsize=partitionSize;
    }

    public void partitionArray() 
    {
        int num=(int) Math.ceil((double)array.length/partitionsize);
        partitions=new int[num][];

        int index=0;
        for (int i=0;i<array.length;i+=partitionsize) 
        {
            int partitionsize=Math.min(this.partitionsize,array.length - i);
            partitions[index]=new int[partitionsize];
            System.arraycopy(array,i,partitions[index],0,partitionsize);
            index++;
        }
    }

    public void reorderPartitions(int[] order) {
        int[][] reorder=new int[partitions.length][];
        for (int i=0;i<order.length;i++) 
        {
            reorder[i]=partitions[order[i]-1];
        }
        partitions=reorder;
    }

    public int[] mergePartitions() {
        int totalLength=0;
        for (int[] partition:partitions) 
        {
            totalLength+=partition.length;
        }

        int[] mergedarray=new int[totalLength];
        int index=0;
        for (int[] partition:partitions) 
        {
            for (int num:partition) 
            {
                mergedarray[index++] = num;
            }
        }
        return mergedarray;
    }
}