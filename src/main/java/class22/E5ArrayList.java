package class22;

import java.util.ArrayList;

public class E5ArrayList {
    public static void main(String[] args) {


    ArrayList<String> names=new ArrayList<>();
        names.add("Maria");
        names.add("Poorna");
        names.add("Damla");
        names.add("Kamla");

//        for(String s:names){
//            if(s.contains("o")){
//                System.out.println("Yes");
//            }else{
//                System.out.println("No");
//            }
//        }

        for(int i=0;i<names.size();i++){
            String s = names.get(i);
            if(s.contains("o")){
                names.set(i,"Java");
            }
            System.out.println((names));
}


    }}
