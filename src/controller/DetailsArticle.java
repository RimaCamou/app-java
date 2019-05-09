package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bd.ConnexionBD;
import model.Article;

@WebServlet("/edit")
public class DetailsArticle extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Article article = null;
		int id = Integer.parseInt(req.getParameter("id"));
		Connection cnx = ConnexionBD.getCnx();
		try {
			PreparedStatement ps = cnx.prepareStatement("select * from article where id = ?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				article = new Article(rs.getInt("id"), rs.getString("nom"), rs.getInt("pu"), rs.getInt("qte"));
			}
			
		} catch (SQLException e) {
			System.out.println("Erreur SQL : "+e.getMessage());
		}
		req.setAttribute("article", article);
		this.getServletContext().getRequestDispatcher("/WEB-INF/vues/details-article.jsp").forward(req, resp);
	}
}
