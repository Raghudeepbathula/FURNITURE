package sample;

public class star {

    public static void main(String[]args){
        String[] chars= {"*"," "};
        for (int y=0;y<4;y++){
            int count =0;
            if (y %2!=0){
                count++;
            }
            for (int x=0;x<9;x++){
                System.out.print(chars[count%2]);
                count++;
            }
            System.out.println();

        }

    }
}
