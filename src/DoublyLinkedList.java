import java.security.DigestException;

public class DoublyLinkedList {
    private Node ilk = null;
    public void oneEkle(int deger)
    {
        Node yeni=new Node(deger);
        yeni.sonraki=ilk;
        yeni.onceki=null;
        if (ilk !=null)
            ilk.onceki=yeni;
        ilk=yeni;
    }
    public void dugumunSonrasınaEkle(Node oncekiNode,int deger)
    {

        if (oncekiNode==null)
            return;
        Node yeni=new Node(deger);
        yeni.sonraki=oncekiNode.sonraki;
        oncekiNode.sonraki=yeni;
        yeni.onceki=oncekiNode;
        if (yeni.sonraki!=null)
            yeni.sonraki.onceki=yeni;

    }
    public void sonaEkle(int deger)
    {
        Node yeni=new Node(deger);
        Node son=ilk;
        yeni.sonraki=null;
        if (ilk==null)
        {
            yeni.onceki=null;
            ilk=yeni;
            return;
        }
        while (son.sonraki!=null)
            son=son.sonraki;
        son.sonraki=yeni;
        yeni.onceki=son;
    }
    public void dugumunOncesineEkle(Node SonrakiD,int deger)
    {
        if (SonrakiD==null)
            return;
        Node yeni=new Node(deger);
        yeni.onceki=SonrakiD.onceki;
        SonrakiD.onceki=yeni;
        yeni.sonraki=SonrakiD;
        if (yeni.onceki!=null)
            yeni.onceki.sonraki=yeni;
        else
            ilk=yeni;
    }
    public Node Bul(int aranan)
    {
        Node son=ilk;
        while (son.sonraki!=null)
        {
            if (son.deger==aranan)
                return son;
            son=son.sonraki;
        }
        if (son.deger==aranan)
            return son;
        return null;
    }
    public void List()
    {
        Node son=ilk;
        while (son.sonraki!=null)
        {
            System.out.println(son.deger);
            son=son.sonraki;
        }
        System.out.println(son.deger);

    }

}
