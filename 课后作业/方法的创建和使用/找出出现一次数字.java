
//��һ�����ݣ�ֻ��һ�������ǳ���һ�Σ����������Σ����ҳ�������֡�
public class ��Ŀ1 {
    public static int findNum( int ayyay[]){
        for (int i = 0; i < ayyay.length; i++) {
            int count = 0;//ÿ�ν������ѭ��������������
            for (int j = 0; j < ayyay.length; j++) {
                if (i == j){
                    continue;//����i=j��ѡ�ִ����һ��ѭ��������ÿ�ζ���һ����ͬ��
                }
                if(ayyay[i]==ayyay[j]){
                    count++;
                    break;
                }
            }
            if(count==0)
                return ayyay[i];
        }
        return 0;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,5,4,3,1,2,5};
        System.out.println(findNum(arr));
    }
}





