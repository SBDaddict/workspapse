package ch4;

public class FlowEx1_4_33 {
    public static void main(String[] args){
      loop1 : for(int i = 2 ; i <= 9 ; i++){
          for(int j = 1 ; j <= 9 ; j++){
              if(j==5){
//                  break loop1; // loop1의 이름붙인 for문을 빠져나간다.
//                  break; // 중첩 for문 안에 있는 if문만 빠져나간다.
//                  continue loop1; // 밑의 코드를 건너뛰고 loop1부터 다시 반복한다.
                  continue; // j가 5가 되면  System.out.printf("%d * %d = %d%n",i,j,i*j); 건너뛰고
                  // 다시 반복한다.
              } // if and
              System.out.printf("%d * %d = %d%n",i,j,i*j);
          } // for and
      }// loop1 for and

        }//main and
    }

