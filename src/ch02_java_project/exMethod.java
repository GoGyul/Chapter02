package ch02_java_project;

public class exMethod {
    // �ν��Ͻ� ���� 
    public String pVal = "test Instance Value";
 
    public void changeValue(exMethod test, String[] pArrVal) {
        test.pVal = "change Instance Value";
        
        for(int i=0; i < pArrVal.length; i++) {
            pArrVal[i] = "change test" + Integer.toString(i);
        }
    }
    
    public static void main(String[] args) {
        //�迭 
        String[] pArrVal = new String[]{"test", "test2"};
        
        exMethod test = new exMethod();
        
        System.out.println("Ŭ���� �� ������� pVal : " + test.pVal);
 
        System.out.print("�迭 �� : ");
        for(String innerVal : pArrVal) {
            System.out.print(innerVal + ", ");
        }
        
        System.out.println("\n");
 
        //�޼ҵ� ȣ��
        test.changeValue(test, pArrVal);
        
        System.out.println("�޼ҵ� ȣ�� ��Ŭ���� �� ������� pVal : " + test.pVal);
 
        System.out.print("�޼ҵ� ȣ�� �� �迭 �� : ");
        for(String innerVal : pArrVal) {
            System.out.print(innerVal + ", ");
        }
    }
}

