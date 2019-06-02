package CRUD;

import org.junit.Test;
import static io.restassured.RestAssured.given;


public class UserTest {
	
	@Test
	public void testThis() {
		//createUser();
		deleteUser();
	}
	
	//Create User
	public void createUser() {
		String body = "{\"status\":\"success\",\"characterName\":\"test\",\"timePlayed\":170272,\"levels\":{\"archer\":18,\"barbarian\":1,\"bard\":1,\"fisher\":3,\"gambler\":1,\"orbhealer\":2,\"paladin\":1,\"runemage\":1,\"shaman\":1,\"swordboard\":1,\"unarmed\":1},\"stats\":[{\"name\":\"fish_totalweight\",\"record\":89.14999999999999},{\"name\":\"monsters_killed\",\"record\":3050},{\"name\":\"gathers\",\"record\":134},{\"name\":\"bosskills_traduworldboss\",\"record\":2}],\"fellowshipName\":\"\",\"equipment\":[\"87@1@{\\\"itemLevel\\\":18,\\\"armor\\\":280,\\\"vitality\\\":89,\\\"maxDurability\\\":200,\\\"rarity\\\":\\\"rare\\\",\\\"durability\\\":180}\",\"94@1@{\\\"itemLevel\\\":20,\\\"armor\\\":330,\\\"vitality\\\":97,\\\"maxDurability\\\":220,\\\"rarity\\\":\\\"rare\\\",\\\"durability\\\":198}\",\"124\",\"380@1@{\\\"crit\\\":10,\\\"itemLevel\\\":16,\\\"maxDurability\\\":180,\\\"rarity\\\":\\\"rare\\\",\\\"durability\\\":162}\",\"227@1@{\\\"itemLevel\\\":20,\\\"attack\\\":1000,\\\"strength\\\":76,\\\"maxDurability\\\":220,\\\"rarity\\\":\\\"rare\\\",\\\"durability\\\":198}\",\"95@1@{\\\"itemLevel\\\":17,\\\"armor\\\":345,\\\"vitality\\\":81,\\\"maxDurability\\\":190,\\\"rarity\\\":\\\"rare\\\",\\\"durability\\\":171,\\\"majordye\\\":\\\"taffey\\\"}\",\"90@1@{\\\"itemLevel\\\":20,\\\"armor\\\":310,\\\"vitality\\\":78,\\\"maxDurability\\\":220,\\\"rarity\\\":\\\"rare\\\",\\\"durability\\\":198}\",\"\",\"380@1@{\\\"crit\\\":10,\\\"itemLevel\\\":17,\\\"maxDurability\\\":190,\\\"rarity\\\":\\\"rare\\\",\\\"durability\\\":171}\",\"\",\"190\",\"41\",\"81\",\"78\",\"65\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\"],\"id\":\"090613459d2c8d073bd7d612460717f3\"}";
		given().
			param("user",body.toString()).
		when().
			post("http://localhost:8080/app/SaveUser");
	}
	
	//Delete User
	public void deleteUser() {
				given().param("name", "test").
				when().
				post("http://localhost:8080/app/DeleteUser");
	}
}
