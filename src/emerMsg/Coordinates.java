

public class Coordinates {
	double x; // X 좌표
    double y; // Y 좌표

    // 생성자
    public Coordinates(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // getter 메서드
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    
    public void mouseClick(double x, double y) {
        Coordinates clickedPosition = new Coordinates(x, y);
       // Region region = getSvgRegionAtCoordinates(clickedPosition);
        //if (region != null) {
          //  region.displayMessage(); // 해당 지역의 메시지 표시
        }
    }
//}
