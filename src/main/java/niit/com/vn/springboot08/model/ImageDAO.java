package niit.com.vn.springboot08.model;

import niit.com.vn.springboot08.db.DatabaseConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ImageDAO {
    private Connection connection;

    // Phương thức để lấy danh sách tất cả các hình ảnh từ bảng images
    public List<Image> getAllImages() {
        List<Image> images = new ArrayList<>();

        try {
            conn = DatabaseConnection.getConnection();
            String query = "SELECT id, name FROM images";
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                Image image = new Image(id, name);
                images.add(image);
            }

            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return images;
    }
}