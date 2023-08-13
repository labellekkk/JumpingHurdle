import stanford.karel.Karel;



public class HurdleJumping extends Karel {

    public void run (){
        completeJumpHurdle();
    }

        void completeJumpHurdle(){
            for (int i = 0; i < 13; i++) {
                if (frontIsClear()){
                    move();
                }else {
                    jumpHurdle();
                }
            }
        }

        void jumpHurdle(){
                ascend();
                move();
                descend();
        }

        void ascend(){
            turnLeft();
            while (rightIsBlocked()){
                move();
            }
            turnRight();
        }

        void descend(){
            turnRight();
            while (frontIsClear()){
                move();
            }
            turnLeft();

        }
        void turnRight(){
            turnLeft();
            turnLeft();
            turnLeft();
        }




}
