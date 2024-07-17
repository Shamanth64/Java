import files.payload;
import io.restassured.path.json.JsonPath;

public class ComplexJsonParse {

	public static void main(String[] args) {
		JsonPath js = new JsonPath(payload.CoursePrice());

		//Print No of courses returned by API
		int count  = js.getInt("courses.size()");
		System.out.println("Courses count = " + count);

		//Print Purchase Amount
		int totalAmount = js.getInt("dashboard.purchaseAmount");
		System.out.println("Total amount = " + totalAmount);

		//Print Title of the first course
		  String titleFirstCourse = js.get("courses[0].title");
		  System.out.println("First course = " +titleFirstCourse);

		  //Print All course titles and their respective Prices
		  for(int i = 0;i < count;i++) {
			  String courseTitles  =  js.get("courses[" + i + "].title");
			  System.out.print("Title: " + courseTitles + ", Price: ");
			  System.out.println(js.get("courses[" + i + "].price").toString());
		  }

		  //Print no of copies sold by RPA Course
		 System.out.print("Print no of copies sold by RPA Course  =  ");
		 for(int i = 0;i < count;i++) {
			  String courseTitles = js.get("courses["+i+"].title");
			  if(courseTitles.equalsIgnoreCase("RPA")) {
				  int copies = js.get("courses["+i+"].copies");
				  System.out.println(copies);
				  break;
			  }
		 }
		System.out.print("Print no of copies sold by Cypress Course  =  ");
		for(int i = 0;i < count;i++) {
			String courseTitles = js.get("courses["+i+"].title");
			if(courseTitles.equalsIgnoreCase("Cypress")) {
				int copies = js.get("courses["+i+"].copies");
				System.out.println(copies);
				break;
			}
		}
	}
}
