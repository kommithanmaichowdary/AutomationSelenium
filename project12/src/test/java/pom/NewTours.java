package pom;

import java.io.IOException;

public class NewTours {
	public static void main(String[] args) throws IOException {
		PomNewtours obj = new PomNewtours();

		obj.user_opens_and_navigate_to_new_tours_site();
		obj.user_gets_the_username_and_password_from_property_list_and_clicks_on_link_register();
		obj.get_the_screenshot();
		obj.get_the_country_names_from_dropdown_and_add_to_excel_sheet();
	}
}
