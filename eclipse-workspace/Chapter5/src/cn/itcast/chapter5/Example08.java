package cn.itcast.chapter5;

public class Example08 {

	public static void main(String[] args) {
		System.out.println("1�����---------------");
        add();
        System.out.println("2��ɾ��---------------");
        remove();
        System.out.println("3���޸�---------------");
        alter();
	}
	public static void add() {
		StringBuffer sb=new StringBuffer();//����һ���ַ���������
		sb.append("abcdefg");
		System.out.println("append���:"+sb);
		sb.insert(2, "123");//��ָ��λ������ַ���
		System.out.println("insert���:"+sb);
	}
    public static void remove() {
    	StringBuffer sb=new StringBuffer("abcdefg");
    	sb.delete(1, 5);//ָ����Χ���
    	System.out.println("ɾ��ָ����Χ��"+sb);
    	sb.deleteCharAt(2);//ָ��λ��ɾ��
    	System.out.println("ɾ��ָ��λ�ã�"+sb);
    	sb.delete(0, sb.length());
    	System.out.println("��ջ�����"+sb);
    }
    public static void alter() {
    	StringBuffer sb=new StringBuffer("abcdefg");
    	sb.setCharAt(1, 'p');//�޸�ָ��λ��
    	System.out.println("�޸�ָ��λ�ã�"+sb);
    	sb.replace(1, 3, "qq");//�滻ָ��λ���ַ����ַ��� [1,3)����ҿ�
    	System.out.println("�滻ָ��λ���ַ���������"+sb);
    	System.out.println("�ַ�����ת�����"+sb.reverse());
    }
}
