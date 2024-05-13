import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ToDoList[]lists=new ToDoList[10];
        Scanner scanner= new Scanner(System.in);
        int count=0;
        while (true){
            System.out.println("Menaxhimi i to do list");
            System.out.println("1. krijimi i to do list");
            System.out.println("2. menaxhimi i to do list");
            System.out.println("3. dil");
            System.out.println("Vendosni zgjidhjen tuaj");
            int choice= scanner.nextInt();
            scanner.nextLine();// percakton ndryshimin e datatype qe do marri skaneri
            if(choice==1){
                if(count< lists.length){
                    System.out.println("Vendosni emrin e to do list");
                    String name= scanner.nextLine();
                    lists[count]=new ToDoList(name,10);
                    count++;
                    System.out.println("Lista u krijua");

                }else{
                    System.out.println("ju nuk mund te krijoni me lista !Keni arritur limitin");
                }
            }else if(choice==2){
                System.out.println("Kjo eshte lista me detyra");
                for(int i =0;i<count;i++){
                    System.out.println((i+1)+" "+lists[i].name);
                }
                System.out.println("ju lutem vendosni indeksin e listes qe doni te punoni");
                int index=scanner.nextInt();
                ToDoList list=lists[index-1];
                

            }
        }



    }
}