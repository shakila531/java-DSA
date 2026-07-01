class Array{
    public static void main(String args[]){
        int[] students = {10,20,40,50,30};
        int length = students.length;
        int sum = 0;
        System.out.println("Last student marks:" + students[length-1]);
        for(int i = 0; i < length; i++){
            sum = sum + students[i];
        }
        System.out.println("Sum of student marks:" + sum);
        int avg = sum / length;
        System.out.println("Average of the students mark is:" + avg);
        for(int i = 0; i < length -1; i++){
            for(int j=0; j < length -i -1; j++){
                if(students[j] > students[j+1]){
                    int temp = students[j];
                    students[j] = students[j+1];
                    students[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted student marks:");
        for(int i = 0; i < length; i++){
            System.out.println(students[i] + " ");
        }
        System.out.println(" the highest student marks is:" + students[length-1]);
    }
}
