class Array03
{
	public static void main(String[] args) 
	{
	
	//int j [��] [��]  = new int [3] [2]
	//2���� �迭�� ���� 
	int jumsu[][];//�迭�� ���� �޸� �Ҵ� ���� ����
	jumsu = new int[4][3];//12���� ����Ʈ�� ���� �� �� �ִ� ���� ����
	
	int test[][]= new int [5][4]; 

	//�ι�° �л��� �������� 80���� ���� 
	jumsu[1][1]=80;
	jumsu[2][2]=10;


	//�迭�� ��� ������ �����ϴ� ���
	//2���� �迭�� ���� �� �迭��.length
	//				ĭ�� �迭�� [���� index].length
	for (int row=0; row<jumsu.length;row++ ){//�� 0,1,2,3���� ���� 
		for (int col = 0;col<jumsu[row].length;col++ ){//�� 0.1.2
			System.out.printf("%5d",jumsu[row][col]);
			}
			System.out.println();
		}
		//2���� �迭�� �ʱⰪ �����ϴ� ���
		//                           {{1��},{2��}}
		//						  0  1  2  3 4��								
		int data[][]=new int[][]{{50,30,40,0,0},
								 {56,88,99,0,0},
								 {88,70,80,0,0},
								 {55,33,44,0,0},
								 {51,89,97,0,0},
								 {89,71,81,0,0},
								 {0,0,  0,0,0}};

		//�������
		for (int row =0; row <data.length-1 ;row++ ){//0,1,2,3,4,5
			for (int col =0;col<data[row].length-2 ;col++ ){//0,1,2
				data[row][3] += data[row][col];//�հ�
				data[data.length-1][col]+=data[row][col];//�������� 
			
					
		}
		
			data[row][4]=data[row][3] /3;

		}
			
		//����ϱ���
	for (int row=0;row<data.length;row++ )
		{for (int col=0;col<data[row].length;col++ )
		{System.out.print(data[row][col]+"\t");
		}
		System.out.println();
			
		}

		
	}
}


/*
2���� �迭 : ��� ���� �ִ� �迭����
			 ���� ���������� �����Ҽ� �ִ�.
			 �迭������ ũ�⸦ ������ �� ����.
*/
