import java.util.Scanner;
class ForEx12
{
	public static void main(String[] args) 
	{
				
		//�����Է��� ���� ��ĳ�� �Ҵ�
		Scanner scanner = new Scanner(System.in);
		//������ �Է�
		System.out.printf("����(Ȧ��) : ");
		//�Է��� ������ ����� ����
		int pushNum = scanner.nextInt();

		//¦���϶�, Ȧ���� �ٲٴ� ���ǹ�
		if(pushNum % 2 == 0){
			pushNum++;
		}
		System.out.printf("�Է��� ����(����� ����) : %d\n", pushNum);

		// 'A' �� 65
		// 'Z' �� 90 �̴�.
		char ch = 'A';
		
		//
		int step =2;
		//���κ� �ﰢ��
		for(int max = 1; max >= 1; max+=step){
			//������ �׷�����.
			//������ (��ü ���ڼ�(pushNum) - ��µ� ���ڼ�) /2 �̴�.
			for(int space1 = 1; space1 <= (pushNum - max) / 2; space1++){
				System.out.printf(" ");
			}
			//����ܾ ����غ���.
			for(int col1 = 1; col1 <= max; col1++){
				System.out.printf("%c",ch);
				ch++;
				if(ch > 'Z'){
					ch = 'A';
				}
			}
			//���ٳѱ��
			System.out.printf("\n");

			if(pushNum == max){
				step = -2;
			}

	������:���� ������ �������� ���ʷ� ���۵Ǿ� �ϳ⿡ �ѹ��� ���鼭 �޴� ������� ����� �־��� ������ ��ſ��Է� �Ű��� �� ������ 4�� �ȿ� ��� ���� ������ �մϴ�. �� ������ �����ؼ� 7���� ����� �ʿ��� ������� ���� �ּž� �մϴ�. ���縦 �ص� �����ϴ�. Ȥ �̽��̶� �Ͻ��� ������ ����Դϴ�.
 

�������� HGXWCH�̶�� ����� 1930�⿡ �� ������ �޾ҽ��ϴ�. �״� �񼭿��� �����ؼ� ������� �߽��ϴ�. ��ĥ �ڿ� ������ ��÷�Ǿ� 20���� �޾ҽ��ϴ�. � �̴� �� ������ �޾����� 96�ð� �̳� �ڽ��� �տ��� ������ �Ѵٴ� ����� �ؾ����ϴ�. �״� �� �����Ǿ����ϴ�.

���̷� ��������
		}
	}
}

