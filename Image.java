/**
 * Jack O Callaghan
 *20258968
 /**
 * Jack O Callaghan
 *20258968
 */

class Image {
    int width;
    int height;
    int[][] image; 
    Image(int x, int y) {
        this.width = x;
        this.height = y;
        this.image = new int[x][y];
        int num = 0;
        for(int i = 0; i<height; i++){
            for(int j = 0; j < width; j++){
                image[j][i] = num;
                num++;
            }
        }
    }
    int[][] getImage(){
        return  image;
    }
    int getHeight() {
        return height;
    }

    int getWidth() {
        return width;
    }

    int getPixel(int x, int y) {
        return image[x][y];
    }

    void setPixel(int x, int y, int value) {
        image[x][y] = value;
    }

    void display() {
        for(int y = 0; y<height; y++){
            for(int x = 0; x < width; x++){
                System.out.print(getPixel(x,y) + " | ");
            }
            System.out.println("\n");
        }

    }
    private void flipAxis(){
        int oldWidth = width;
        width = height;
        height = oldWidth;
    }
    public void rotate(boolean clockwise){
        Image rotatedImage = new Image(height,width);
        if(clockwise) {         
            flip(true);            
            for (int y = 0; y <= height - 1; y++) {
                for (int x = 0; x <= width - 1; x++) {
                    rotatedImage.setPixel(y, x, this.getPixel(x, y));
                }
            }
        }else{           
            flip(false);           
            for (int y = 0; y <= height - 1; y++) {
                for (int x = 0; x <= width - 1; x++) {
                    rotatedImage.setPixel(y, x, this.getPixel(x, y));
                }
            }
        }
        image = rotatedImage.image;
        flipAxis();
    }
    public void flip(boolean horizontal){
        Image flippedImage = new Image(width,height);
        if(horizontal) {            
            for (int y = 0; y <= height - 1; y++) {
                for (int x = 0; x <= width - 1; x++) {

                    flippedImage.setPixel(x, y, this.getPixel(x, height - y - 1));
                }
            }
        }else {           
            for (int y = 0; y <= height - 1; y++) {
                for (int x = 0; x <= width - 1; x++) {
                    flippedImage.setPixel(x, y, this.getPixel(width - x - 1, y));
                }
            }
        }
        image = flippedImage.image;
    }
}