package br.com.cassiolpaixao.lojaweb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.cassiolpaixao.lojaweb.config.DatabaseConfig;
import br.com.cassiolpaixao.lojaweb.entity.Pessoa;
import br.com.cassiolpaixao.lojaweb.util.CriptoUtil;

public class PessoaDAO {

	public boolean isLoggedIn(Pessoa pessoa) throws SQLException {

		StringBuilder sql = new StringBuilder();
		sql.append("SELECT * FROM usuario WHERE login = ? AND senha = ?");
		try (Connection connection = DatabaseConfig.getInstace().getConnection()) {
			PreparedStatement prepareStatement = connection.prepareStatement(sql.toString());
			prepareStatement.setString(1, pessoa.getLogin());
			prepareStatement.setString(2, CriptoUtil.criptoStringHexMD5(pessoa.getSenha()));
			ResultSet rs = prepareStatement.executeQuery();
			return rs.next();
		}
	}

	public static void main(String[] args) {
		try {
			boolean loggedIn = new PessoaDAO().isLoggedIn(new Pessoa("cassio", "123"));
			System.out.println(loggedIn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
