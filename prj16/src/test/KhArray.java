package test;

import java.util.Arrays;

public class KhArray {
   
   public KhArray() {
      arr = new int[3];
   }

   private int[] arr;
   private int idx = 0;
   
   //데이터를 추가하는 메서드
   public void add(int data) {
      if(idx == arr.length) {
         int[] newArr = new int[arr.length * 2];
         for(int i = 0; i < arr.length; ++i) {
            newArr[i] = arr[i];
         }
         arr = newArr;
      }
      arr[idx++] = data;
   }
   
   //데이터를 조회하는 메서드
   public int get(int idx) {
      return arr[idx];
   }
   
   //데이터를 삭제하는 메서드
   public void delete(int n) {
      for(int i = n; i < idx; ++i) {
         arr[i] = arr[i+1];
      }
      idx--;
      arr[idx] = 0;
   }

   public void printArray() {
      for(int i = 0 ; i < idx; ++i) {
         System.out.println(arr[i]);
      }
   }
   
   
   
   

   
   
   

}
