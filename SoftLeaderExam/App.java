package softLeader;

import java.util.List;

/**
�W�����D: �p��H�Ʀ���
�\��ݨD:
		�o�̦��@���Y���q��2016�~5��������u���d�����A���������ӭ��u��骺���d�ɶ��P�~��ɶ�
		�Эp��X�C����u�������h���~��
		
		�ھڬ���Ұ�k�W�w�A�u�ɶW�L8�p�ɫ�A�[�Z�O���̤U�C���v�p��
			��0~8�p�ɵ������~��
			��8~12�p�ɵ������~��X1.5��
			��12�p�ɶ}�l�������~��X2.0��
<br>
���{���}�o�ݨD:
		5������d��ƪ����o�覡���I�sTimeClockService.getData();
		�p��C����u�����I�~���A�ШϥΥ�class�U��printSomebodyPay��k�N���G��ܦbconsole
<br>
���D����:
	1.���F�����D���������ѥ~(�Ŧ���ѳ���)�A�A�i�H��o�ӵ{���������޿�(�tprintSomebodyPay)���ק�
	2.���{���ҨϥΪ�����ɶ�����LocalDateTime�A�o�O�@�ө�jdk8��~�ޤJ��class
	  LocalDateTime���@�M������api�i�H�p���Ӯɶ������Z�A�Цۦ�j��
<br>
	�Y�n���յ{���O�_�i�H�B�@�A�i�H��������main��k
	
@author Rhys
*****�����D���v���Q���ީҦ�*****
**/
public class App {

	public static void main(String[] args) {
		final List<TimeClockEntity> TimeClockData = TimeClockService.getData();
		
	}

	public static void printSomebodyPay(String name , double pay){
		System.out.printf("%1$s    %2$.2f\n",name,pay);
	}
}
