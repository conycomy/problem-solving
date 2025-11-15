
import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		  Scanner sc = new Scanner(System.in);
     int T = sc.nextInt();


        for(int t = 1; t <= T; t++) {
            int[] score = new int[101];
            int testCaseNumber = sc.nextInt();
            int[] students = new int[1000];

            for (int j = 0; j < 1000; j++) {
                students[j] = sc.nextInt();
                score[students[j]]++;

            }

            int maxNumber = score[0];
            int maxScore = 0;
            for (int avg = 1; avg < score.length; avg++) {
                if(maxNumber < score[avg]) {
                    maxNumber = score[avg];
                    maxScore = avg;
                }

                if(maxNumber == score[avg]) {
                    if (maxScore < avg) {
                        maxScore = avg;
                    }
                }
            }
            System.out.println("#" + t + " " + maxScore);
        }
		}
	}
