public class Array {

    public static void main(stringImplementation[] args) {
        int nums[] = {1, 2, 3, 4, 5};
        int nums2[][] = new int[3][4];
//        int random=0;


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                nums2[i][j] = (int) (Math.random() * 100);
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(nums2[i][j] + " ");
            }
            System.out.println();
        }
//
//        for(int i:nums){
//            System.out.println(i);
//        }

        System.out.println();

// jagged arrray

        int nums3[][] = new int[3][];

        nums3[0] = new int[3]; // oth row have 3 element
        nums3[1] = new int[4]; // 1th row have 4 element
        nums3[2] = new int[2];

        for(int i=0;i<nums3.length;i++){
            for(int j=0;j<nums3[i].length;j++){
                nums3[i][j]=(int)(Math.random()*10);
                System.out.print(nums3[i][j]+" ");
            }
            System.out.println();
        }
    }
}