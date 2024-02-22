/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedList;

/**
 *
 * @author Trang Phan
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DaThuc_LinkedList implements Cloneable{
    public LinkedListNode head = new LinkedListNode();
    public DaThuc_LinkedList(){
        head = null;
    }
    @Override
    public DaThuc_LinkedList clone(){
        try{
            return (DaThuc_LinkedList) super.clone();
        } catch(CloneNotSupportedException e){
            return null;
        }
    }
    
    public void themLinkedListNode(HangTu hangTu){
        LinkedListNode LinkedListNodeMoi = new LinkedListNode(hangTu);
        if(head == null || hangTu.getSoMu() > head.getHangTu().getSoMu()){
            LinkedListNodeMoi.setNext(head);
            head = LinkedListNodeMoi;
        }else{
            LinkedListNode LinkedListNodeHienTai = new LinkedListNode();
            LinkedListNodeHienTai = head;
            while(LinkedListNodeHienTai.getNext() != null &&
                    LinkedListNodeHienTai.getNext().getHangTu().getSoMu()>= 
                    hangTu.getSoMu()){
                LinkedListNodeHienTai = LinkedListNodeHienTai.getNext();
            }
            LinkedListNodeMoi.setNext(LinkedListNodeHienTai.getNext());
            LinkedListNodeHienTai.setNext(LinkedListNodeMoi);
        }
    }
    
    /*
    public DaThuc_LinkedList congHaiLinkedList(DaThuc_LinkedList a, DaThuc_LinkedList other){
        DaThuc_LinkedList TongHaiLinkedList = new DaThuc_LinkedList();
        LinkedListNode LinkedListNode1 = a.head;
        LinkedListNode LinkedListNode2 = other.head;
        while(LinkedListNode1 != null && LinkedListNode2 != null){
            if((LinkedListNode1.getHangTu().getSoMu()==LinkedListNode2.getHangTu().getSoMu())&&
                    LinkedListNode1.getHangTu().getBien().equals(LinkedListNode2.getHangTu().getBien())==true){
                        HangTu temp = new HangTu(LinkedListNode1.getHangTu().getHeSo()+
                                LinkedListNode2.getHangTu().getHeSo(), 
                                LinkedListNode1.getHangTu().getSoMu(),
                        LinkedListNode1.getHangTu().getBien());
                        TongHaiLinkedList.themLinkedListNode(temp);
                        LinkedListNode1 = LinkedListNode1.getNext();
                        LinkedListNode2 = LinkedListNode2.getNext();
                
            }else if (LinkedListNode1.getHangTu().getSoMu()>
                    LinkedListNode2.getHangTu().getSoMu()){
                TongHaiLinkedList.themLinkedListNode(LinkedListNode1.getHangTu());
                LinkedListNode1 = LinkedListNode1.getNext();
            }else{
                TongHaiLinkedList.themLinkedListNode(LinkedListNode2.getHangTu());
                LinkedListNode2 = LinkedListNode2.getNext();
            }
        }
        while(LinkedListNode1 != null){
            TongHaiLinkedList.themLinkedListNode(LinkedListNode1.getHangTu());
            LinkedListNode1 = LinkedListNode1.getNext();
        }
        while (LinkedListNode2 !=null){
            TongHaiLinkedList.themLinkedListNode(LinkedListNode2.getHangTu());
            LinkedListNode2 = LinkedListNode2.getNext();
        }
        System.out.println(a.show()+" "+other.show() + "...");
        return TongHaiLinkedList;
    }
    
    */
   /*
    public DaThuc_LinkedList congHaiLinkedList(DaThuc_LinkedList a, DaThuc_LinkedList other) {
    DaThuc_LinkedList TongHaiLinkedList = new DaThuc_LinkedList();
    LinkedListNode LinkedListNode1 = a.head;
    LinkedListNode LinkedListNode2 = other.head;
    
    while (LinkedListNode1 != null && LinkedListNode2 != null) {
        if (LinkedListNode1.getHangTu().getSoMu() == LinkedListNode2.getHangTu().getSoMu()) {
            HangTu temp = new HangTu(LinkedListNode1.getHangTu().getHeSo() + LinkedListNode2.getHangTu().getHeSo(), 
                                     LinkedListNode1.getHangTu().getSoMu(), 
                                     LinkedListNode1.getHangTu().getBien());
            TongHaiLinkedList.themLinkedListNode(temp);
            LinkedListNode1 = LinkedListNode1.getNext();
            LinkedListNode2 = LinkedListNode2.getNext();
        } else if (LinkedListNode1.getHangTu().getSoMu() > LinkedListNode2.getHangTu().getSoMu()) {
            TongHaiLinkedList.themLinkedListNode(LinkedListNode1.getHangTu());
            LinkedListNode1 = LinkedListNode1.getNext();
        } else {
            TongHaiLinkedList.themLinkedListNode(LinkedListNode2.getHangTu());
            LinkedListNode2 = LinkedListNode2.getNext();
        }
    }
    
    // Add the remaining terms
    while (LinkedListNode1 != null) {
        TongHaiLinkedList.themLinkedListNode(LinkedListNode1.getHangTu());
        LinkedListNode1 = LinkedListNode1.getNext();
    }
    while (LinkedListNode2 != null) {
        TongHaiLinkedList.themLinkedListNode(LinkedListNode2.getHangTu());
        LinkedListNode2 = LinkedListNode2.getNext();
    }
    
    System.out.println(a.show() + " + " + other.show() + " = " + TongHaiLinkedList.show());
    
    return TongHaiLinkedList;
}
*/
    public DaThuc_LinkedList congHaiLinkedList(DaThuc_LinkedList a, DaThuc_LinkedList other) {
    DaThuc_LinkedList TongHaiLinkedList = new DaThuc_LinkedList();
    LinkedListNode LinkedListNode1 = a.head;
    LinkedListNode LinkedListNode2 = other.head;

    while (LinkedListNode1 != null && LinkedListNode2 != null) {
        if (LinkedListNode1.getHangTu().getSoMu() == LinkedListNode2.getHangTu().getSoMu()) {
            HangTu temp = new HangTu(LinkedListNode1.getHangTu().getHeSo() + LinkedListNode2.getHangTu().getHeSo(), 
                                     LinkedListNode1.getHangTu().getSoMu(), 
                                     LinkedListNode1.getHangTu().getBien());
            TongHaiLinkedList.themLinkedListNode(temp);
            LinkedListNode1 = LinkedListNode1.getNext();
            LinkedListNode2 = LinkedListNode2.getNext();
        } else if (LinkedListNode1.getHangTu().getSoMu() > LinkedListNode2.getHangTu().getSoMu()) {
            TongHaiLinkedList.themLinkedListNode(LinkedListNode1.getHangTu());
            LinkedListNode1 = LinkedListNode1.getNext();
        } else {
            TongHaiLinkedList.themLinkedListNode(LinkedListNode2.getHangTu());
            LinkedListNode2 = LinkedListNode2.getNext();
        }
    }

    // Add the remaining terms from the first polynomial
    while (LinkedListNode1 != null) {
        TongHaiLinkedList.themLinkedListNode(LinkedListNode1.getHangTu());
        LinkedListNode1 = LinkedListNode1.getNext();
    }

    // Add the remaining terms from the second polynomial
    while (LinkedListNode2 != null) {
        TongHaiLinkedList.themLinkedListNode(LinkedListNode2.getHangTu());
        LinkedListNode2 = LinkedListNode2.getNext();
    }

    System.out.println(a.show() + " + " + other.show() + " = " + TongHaiLinkedList.show());

    return TongHaiLinkedList;
}

    
 
    
    //bản gốc
    public void nhapDaThuc_LinkedList(String daThuc1, String daThuc2, DaThuc_LinkedList linkedList1, DaThuc_LinkedList linkedList2){
        Pattern pattern = Pattern.compile("([+]?\\d*)([-]?[a-zA-Z]+)(\\^\\d+)?");
        Matcher matcher = pattern.matcher(daThuc1);
        while (matcher.find()) {
            String hesoStr = matcher.group(1);
            String bien = matcher.group(2);
            String soMuStr = matcher.group(3);
        
            int heSo = (hesoStr.isEmpty())?1 : Integer.parseInt(hesoStr);
            int soMu = (soMuStr == null)?1 : Integer.parseInt(soMuStr.substring(1));
            if (bien.isEmpty()) {
                bien = "1";
            }
            HangTu ht = new HangTu(heSo, soMu, bien);
            linkedList1.themLinkedListNode(ht);
            }
        
        Pattern pattern2 = Pattern.compile("([+]?\\d*)([-]?[a-zA-Z1-9]+)(\\^\\d+)?");
        Matcher matcher2 = pattern2.matcher(daThuc2);
        while (matcher2.find()) {
            String hesoStr = matcher2.group(1);
            String bien = matcher2.group(2);
            String soMuStr = matcher2.group(3);
            int heSo = (hesoStr.isEmpty())?1: Integer.parseInt(hesoStr);
            int soMu = (soMuStr == null)?1: Integer.parseInt(soMuStr.substring(1));
            if (bien.isEmpty()) {
                bien = "1";
            }
            HangTu ht = new HangTu(heSo, soMu, bien);
            linkedList2.themLinkedListNode(ht);
            }
    }
   
    
    
    public boolean isValidDaThuc (String daThuc) {
        Pattern pattern = Pattern.compile("([+]?\\d*)([-]?[a-zA-Z]+)(\\^\\d+)?");
        //Pattern pattern = Pattern.compile("([+]?\\d*)([-]?[a-zA-Z1-9]+)(\\^\\d+)?");
        Matcher matcher = pattern.matcher(daThuc);
        while (matcher.find()) {
            String hesoStr = matcher.group(1);
            String bien = matcher.group(2);
            String soMuStr = matcher.group(3);
        try {
             if (!hesoStr.isEmpty()) {
                Integer.parseInt(hesoStr);
                }
             if (soMuStr != null && !soMuStr.isEmpty()) {
                int soMu = Integer.parseInt(soMuStr.substring(1));
                // Kiểm tra xem số mũ có là số nguyên không âm không
                if (soMu < 0) {
                System.out.println("Đã vào điều kiện số mũ âm");
                
                return false;
                    }
                }
            } catch (NumberFormatException e) {
            // Nếu có lỗi NumberFormatException, định dạng không hợp lệ
            System.out.println("Đã vào điều kiện kiểm tra đa thức");
            return false;
                }
        }
        return true;
    }
   
    
/*

    //version chatgpt
    public boolean isValidDaThuc(String daThuc) {
    Pattern pattern = Pattern.compile("([+-]?\\d*)([a-zA-Z]+)(\\^\\d+)?");
    Matcher matcher = pattern.matcher(daThuc);
    while (matcher.find()) {
        String hesoStr = matcher.group(1);
        String bien = matcher.group(2);
        String soMuStr = matcher.group(3);
        try {
            if (!hesoStr.isEmpty()) {
                Integer.parseInt(hesoStr);
            }
            if (soMuStr != null && !soMuStr.isEmpty()) {
                int soMu = Integer.parseInt(soMuStr.substring(1));
                // Check if the exponent is a non-negative integer
                if (soMu < 0) {
                    System.out.println("Invalid exponent detected.");
                    return false;
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid polynomial format detected.");
            return false;
        }
    }
    return true;
}*/

    public DaThuc_LinkedList tinhTongDaThuc(DaThuc_LinkedList linkedList1, DaThuc_LinkedList linkedList2) {
        System.out.println(linkedList1.show());
        DaThuc_LinkedList tongHaiDaThuc = congHaiLinkedList(linkedList1, linkedList2);
        return tongHaiDaThuc;
    }
    public void clearCache(DaThuc_LinkedList linkedList1, DaThuc_LinkedList linkedList2) {
        linkedList1.head.setNext(null);
        linkedList1.head = null;
        linkedList2.head.setNext(null);
        linkedList2.head = null;
    }
    
    
    
    /*
    //gốc
    public String show() {
        String tongHaiDaThuc = "";
        LinkedListNode newNode = head;
        while (newNode != null) {
            HangTu currentHangTu = newNode.getHangTu();
            if (currentHangTu.getSoMu() == 0) {
                tongHaiDaThuc += currentHangTu.getHeSo() + "";
            } else if (currentHangTu.getSoMu() == 1){
                if (currentHangTu.getHeSo() == 1) {
                    tongHaiDaThuc += currentHangTu.getBien();
               } else{
                    tongHaiDaThuc += currentHangTu.getHeSo() + currentHangTu.getBien();
                    }
            } else {
            tongHaiDaThuc += currentHangTu.getHeSo() + currentHangTu.getBien() + "^" + currentHangTu.getSoMu();
            }
            
            if (newNode.getNext() != null) {
                if (newNode.getNext().getHangTu().getHeSo() >= 0) {
                    tongHaiDaThuc += " + ";
                } else {
                    tongHaiDaThuc += "";
                    }
                } else {
                    tongHaiDaThuc += ".";
                    newNode = newNode.getNext();
                }
        }
        return tongHaiDaThuc;
    }
    */
    
    /* ok nè
    public String show() {
    StringBuilder stringBuilder = new StringBuilder();
    LinkedListNode currentNode = head;
    boolean isFirstTerm = true;
    boolean hasTerms = false;

    while (currentNode != null) {
        HangTu currentHangTu = currentNode.getHangTu();
        int heSo = currentHangTu.getHeSo();
        int soMu = currentHangTu.getSoMu();
        String bien = currentHangTu.getBien();

        if (heSo != 0) {
            if (!isFirstTerm && heSo > 0) {
                stringBuilder.append(" + ");
            }
            isFirstTerm = false;

            hasTerms = true;

            if (heSo != 1 && heSo != -1) {
                stringBuilder.append(heSo);
            } else if (heSo == -1) {
                stringBuilder.append("-");
            }

            if (soMu != 0) {
                stringBuilder.append(bien);
                if (soMu != 1) {
                    stringBuilder.append("^").append(soMu);
                }
            } else if (heSo == 1 || heSo == -1) {
                stringBuilder.append("1");
            }
        }

        currentNode = currentNode.getNext();
    }

    if (!hasTerms) {
        stringBuilder.append("0");
    }

    return stringBuilder.toString();
}*/
    
    public String show() {
    StringBuilder stringBuilder = new StringBuilder();
    LinkedListNode currentNode = head;
    boolean isFirstTerm = true;
    boolean hasTerms = false;

    while (currentNode != null) {
        HangTu currentHangTu = currentNode.getHangTu();
        int heSo = currentHangTu.getHeSo();
        int soMu = currentHangTu.getSoMu();
        String bien = currentHangTu.getBien();

        if (heSo != 0) {
            if (!isFirstTerm && heSo > 0) {
                stringBuilder.append(" + ");
            }
            isFirstTerm = false;

            hasTerms = true;

            if (heSo != 1 && heSo != -1) {
                stringBuilder.append(heSo);
            } else if (heSo == -1) {
                stringBuilder.append("-");
            }

            if (soMu != 0) {
                stringBuilder.append(bien);
                if (soMu != 1) {
                    stringBuilder.append("^").append(soMu);
                }
            } else if (heSo == 1 || heSo == -1) {
                stringBuilder.append("1");
            }
        }

        currentNode = currentNode.getNext();
    }

    if (!hasTerms) {
        stringBuilder.append("0");
    }

    return stringBuilder.toString();
}


    public boolean ghiFile(DaThuc_LinkedList daThuc1, DaThuc_LinkedList daThuc2, DaThuc_LinkedList tongDaThuc, String fileName) {
        try {
            FileWriter writer = new FileWriter(fileName, true);
            LinkedListNode hangTul = daThuc1.head;
            LinkedListNode hangTu2 = daThuc2.head;
            LinkedListNode hangTu3 = tongDaThuc.head;
            while (hangTul != null) {
                if (hangTul == daThuc1.head) {
                writer.write("(");
                }
                if (hangTul != null) {
                    if (hangTul.getHangTu().getSoMu() == 0) {
                        writer.write(hangTul.getHangTu().getHeSo() + "");
                    } else if (hangTul.getHangTu().getSoMu() == 1) {
                    if (hangTul.getHangTu().getHeSo() == 1) {
                    writer.write(hangTul.getHangTu().getBien());
                    } else {
                    writer.write(hangTul.getHangTu().getHeSo() +
                    hangTul.getHangTu().getBien());
                    }
                    } else {
                    writer.write(hangTul.getHangTu().getHeSo() +
                    hangTul.getHangTu().getBien() + "^" + hangTul.getHangTu().getSoMu());
                    }
                    if (hangTul.getNext() != null) {
                        if (hangTul.getNext().getHangTu().getHeSo() >= 0) {
                            writer.write(" + ");
                        } else {
                            writer.write(" ");
                        }
                    } else {
                        writer.write(")+");
                    }
                    hangTul = hangTul.getNext();
                    }
            }
            while (hangTu2 != null) {
                if (hangTu2 == daThuc2.head) {
                    writer.write("(");
                    }
                if (hangTu2 != null) {
                    if (hangTu2.getHangTu().getSoMu() == 0) {
                    writer.write(hangTu2.getHangTu().getHeSo() + "");
                    } else if (hangTu2.getHangTu().getSoMu() == 1) {
                    if (hangTu2.getHangTu().getHeSo() == 1) {
                    writer.write(hangTu2.getHangTu().getBien());
                    } else {
                    writer.write(hangTu2.getHangTu().getHeSo() +
                    hangTu2.getHangTu().getBien());
                    }
                } else {
                writer.write(hangTu2.getHangTu().getHeSo() +
                hangTu2.getHangTu().getBien() + "^" + hangTu2.getHangTu().getSoMu());
                }
                if (hangTu2.getNext() != null) {
                if (hangTu2.getNext().getHangTu().getHeSo() >= 0) {
                        writer.write(" + ");
                } else {
                writer.write(" ");
                }
                } else {
                writer.write(") = ");
                }
                hangTu2 = hangTu2.getNext();
                }
                }
                while (hangTu3 != null) {
                if (hangTu3 != null) {
                if (hangTu3.getHangTu().getSoMu() == 0) {
                writer.write(hangTu3.getHangTu().getHeSo() + "");
                } else if (hangTu3.getHangTu().getSoMu() == 1) {
                if (hangTu3.getHangTu().getHeSo() == 1) {
                writer.write(hangTu3.getHangTu().getBien());
                } else {
                writer.write(hangTu3.getHangTu().getHeSo() +
                hangTu3.getHangTu().getBien());
                }
                } else {writer.write(hangTu3.getHangTu().getHeSo() + hangTu3.getHangTu().getBien() + "^" + hangTu3.getHangTu().getSoMu());
                        }
                        if (hangTu3.getNext() != null) {
                        if (hangTu3.getNext().getHangTu().getHeSo() >= 0) {
                        writer.write(" + ");
                        } else {
                        writer.write(" ");
                        }
                        } else {
                        writer.write(".");
                        }
                        hangTu3 = hangTu3.getNext();
                        }
                        }
                        writer.write(System.lineSeparator());
                        writer.close();
                    return true;
                    } catch (IOException e) {
                    System.out.println("Error writing to file: " + fileName);
                    return false;
                    }
    }
    
    public static String docFile(String fileName) {
        String lichSu = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
        String line;
        while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
            for (String part: parts) {
            lichSu +=(formatExpression(part) + "");
            }
            lichSu += "\n"; // Xuống dòng sau mỗi dòng
            }
        } catch (FileNotFoundException e) {
        System.out.println("Khong tim thay " + fileName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return lichSu;
        }
    
    private static String formatExpression(String expression) {
        return expression.trim();
    }
    
    public String showDanhSachDaThuc() {
        return docFile("C:\\Users\\Trang Phan\\OneDrive\\Máy tính\\tai lieu CN\\CDN\\CDN\\src\\nhom7\\GUI\\DaThuc.txt");
    }

}
