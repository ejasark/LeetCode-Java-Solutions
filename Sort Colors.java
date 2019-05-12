
// Java program to sort an array of 0, 1 and 2 
import java.io.*; 
  
class countzot { 
  
    // Sort the input array, the array is assumed to 
    // have values in {0, 1, 2} 
    static void sort012(int a[], int arr_size) 
    { 
        int lo = 0; 
        int hi = arr_size - 1; 
        int mid = 0,temp=0; 
        while (mid <= hi) 
        { 
            switch (a[mid]) 
            { 
            case 0: 
            { 
                temp   =  a[lo]; 
                a[lo]  = a[mid]; 
                a[mid] = temp; 
                lo++; 
                mid++; 
                break; 
            } 
            case 1: 
                mid++; 
                break; 
            case 2: 
            { 
                temp = a[mid]; 
                a[mid] = a[hi]; 
                a[hi] = temp; 
                hi--; 
                break; 
            } 
            } 
        } 
    }
 }
