public class t33 {
    public static void main(String[]args){
        King k=new King();
        k.moves();
    }
}

interface chessPlayer{
    void moves();
}

class Queen implements chessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal(in all directions)");
    }
}

class Rook implements chessPlayer{
    public void moves(){
        System.out.println("up, down, left, right");
    }
}

class King implements chessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal(only 1 step)");
    }
}