public class Test4 {
    public static void main(String[] args) {

        int[] arr = {2, 4, 6};

        Block b = new Block(arr);
        System.out.println(b.getVolume());
        System.out.println(b.getSurfaceArea());

    }
}

class Block {

    int Width;
    int Length;
    int Height;



    Block(int[] arr){
        this.Width = arr[0];
        this.Length = arr[1];
        this.Height = arr[2];
   }

    public int getWidth() {
        return Width;
    }

    public void setWidth(int width) {
        Width = width;
    }

    public int getLength() {
        return Length;
    }

    public void setLength(int length) {
        Length = length;
    }

    public int getHeight() {
        return Height;
    }

    public void setHeight(int height) {
        Height = height;
    }

    public int getVolume(){
        return getHeight() * getLength() * getWidth();
    }

    public int getSurfaceArea(){
        return 2 * (getHeight() * getLength() + getLength() * getWidth() + getWidth() * getHeight());
    }
}
