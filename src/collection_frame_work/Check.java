package collection_frame_work;

import java.util.ArrayList;

public class Check {
    public static void test(){
        ArrayList<Gpay> transactionList = new ArrayList<>();

        Gpay transactions1 = new Gpay();
        transactions1.setId(100);
        transactions1.setName("User1");
        transactions1.setDate("22-04-2022");
        transactions1.setAmount(100000);
        transactionList.add(transactions1);

        Gpay transactions2 = new Gpay();
        transactions2.setId(101);
        transactions2.setName("User2");
        transactions2.setDate("22-04-2022");
        transactions2.setAmount(200000);
        transactionList.add(transactions2);

        Gpay transactions3 = new Gpay();
        transactions3.setId(103);
        transactions3.setName("User3");
        transactions3.setDate("22-04-2022");
        transactions3.setAmount(300000);
        transactionList.add(transactions3);

        Gpay transactions4 = new Gpay();
        transactions4.setId(104);
        transactions4.setName("User4");
        transactions4.setDate("22-04-2022");
        transactions4.setAmount(400000);
        transactionList.add(transactions4);

        if (transactionList.isEmpty()){
            System.out.println("No Details Found!");
        }
        for (Gpay history: transactionList){
            System.out.println(history);
        }


    }

    public static void main(String[] args) {
        test();
    }
}
