package day34_GarbageCollection_AccesModifier;

public class COnstructor_Vs_StaticBlock {
    static{
        System.out.println("Static Block");
    }

    public COnstructor_Vs_StaticBlock(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {

        new COnstructor_Vs_StaticBlock(); //1
        new COnstructor_Vs_StaticBlock(); //2
        new COnstructor_Vs_StaticBlock(); //3
        new COnstructor_Vs_StaticBlock(); //4
        new COnstructor_Vs_StaticBlock(); //5

    }


}
