import javax.swing.JOptionPane;

public class PhuongTrinhBacHai {
	public static void main(String[] args)
	{
		System.out.println("Giải Phương trình Bậc Hai một ẩn ax^2 + bx + c = 0 (a != 0)");

		double a,b,c,delta,x1,x2;
		boolean valid = false;

		while (!valid)
		{
			try
			{
				a = Double.parseDouble(JOptionPane.showInputDialog("Nhập a"));

				// Kiểm tra a là số khác 0
				if (a != 0)
				{
					valid = true;
					System.out.println("a = " + a);
					b = Double.parseDouble(JOptionPane.showInputDialog("Nhập b"));
					System.out.println("b = " + b);
					c = Double.parseDouble(JOptionPane.showInputDialog("Nhập c"));
					System.out.println("c = " + c);
					
					// Chưa kiểm tra được trường hợp nhập giá trị b, c không phải là số
					
					delta = b*b - 4*a*c;

					if (delta<0)
						System.out.println("Phương trình vô nghiệm.");
					else if (delta==0)						
						System.out.println("Phương trình có nghiệm kép x1 = x2 = " + (-b/2*a));
					else
					{
						x1 = (-b + Math.sqrt(delta))/(2*a);
						x2 = (b + Math.sqrt(delta)/(2*a));
						System.out.println("Phương trình có nghiệm x1 = " + x1);
						System.out.println("và x2 = " + x2);
					}
				}
				else {
					System.out.println("Dữ liệu không hợp lệ a != 0. Vui lòng nhập lại.");
				}
			} catch (Exception e)
			{
				System.out.println("Dữ liệu không hợp lệ. Vui lòng nhập lại.");
			}
		}
	}
}
