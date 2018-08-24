package co.grandcircus.coffeeshoplab19;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class ItemDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Item> listAll(){
		String sql = "SELECT * FROM items";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Item.class));
	}
	
	public List<Item> findAll(){
		String sql = "SELECT * FROM items";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Item.class));
	}
	
	public void create(Item item) {
		String sql="INSERT INTO users (id, name, description, quantity, price) VALUES (?,?,?,?,?)";
		jdbcTemplate.update(sql, item.getId(), item.getName(), item.getDescription(), item.getQuantity(), item.getPrice());
		
	}
	
}
