package edu.uoc.ds.adt;


public class PR0GeometricProgressionArray {

    private int[] arrayNumeros;// =  new int[];

    public PR0GeometricProgressionArray(int a, int r, int capacity){
        arrayNumeros = new int[capacity];
        for(int i=0;i<capacity;i++) {
            this.arrayNumeros[i]= (int) (a*Math.pow(r, i+1-1));
        }
    }

    public int[] getArray(){
        return this.arrayNumeros;
    }

    public int getIndexOf(int index){
        for(int i=0;i<this.arrayNumeros.length;i++) {
            if (index==arrayNumeros[i])
                return i;
        }
        return -1;
    }

    public int binarySearch(int numtoSearch){
        int firstElement=0;
        int lenght=arrayNumeros.length;
        while (firstElement <= lenght) {
            int mid = (firstElement + lenght) / 2;
            if (arrayNumeros[mid] == numtoSearch) {
                return mid;
            } else if (arrayNumeros[mid] > numtoSearch) {
                lenght = mid - 1;
            } else {
                firstElement = mid + 1;
            }
        }
        return -1;
    }

}
