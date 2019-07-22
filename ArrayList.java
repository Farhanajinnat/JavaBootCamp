import java.array.List;

public class ArrayList {

	public static void main(String[] args) {

		private List fruitBasket =new ArrayList<>(0);
		public viod addFruits ToBasket()	{	
			fruitBasket.add("Apple");
			fruitBasket.add("Banana");
			fruitBasket.add("Pear");
			fruitBasket.add("Mango");
			for(int i=0; i< fruitBasket.size();i++) {
				System.out.println(fruitBasket.get(i));
				for(String fruit: fruitBasket) {
					System .out.println(fruit);
					int i= 0;
					while(i<fruitBasket.size()) {
						System.out.println(fruitBasket.get(i));
						i++;
					}
				}
			}
				
				
					
		}

	}


