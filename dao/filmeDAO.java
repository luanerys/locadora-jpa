
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.List;
import modelo.Filme;

public class filmeDAO {

	private final Connection conexao;

	public filmeDAO(Connection conexao) {
		this.conexao = conexao;
	}

public Filme salva(Filme filme) throws SQLException {
		
		String sql = "insert into filme (titulo, duracao, anoLancamento, genero) values ( ?, ?, ?, ?)";
		try (PreparedStatement statement = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS))
	
		statement.setString(1, filme.getTitulo());
		statement.setInteger(2, filme.getDuracao());
		statement.setInteger(3, filme.getAnoLancamento());
		statement.setString(4, filme.getGenero());

		statement.execute();

				try (ResultSet keys = statement.getGeneratedKeys()) {
					keys.next();
					int id = keys.getInt(1);
					filme.setIdFilme(id);
				}
			}return filme;

	public void altera(Filme filme) {

		try {
			PreparedStatement ps = this.connection.prepareStatement(
					"update filme set titulo=?, duracao=?, anoLancamento=?, genero=? where idFilme=?");

			ps.setString(1, filme.getTitulo());
			ps.setInteger(2, filme.getDuracao());
			ps.setInteger(3, filme.getAnoLancamento());
			ps.setString(4, filme.getGenero());
			ps.setInteger(5, filme.getIdfilme());

			ps.execute();
			ps.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void remove(Filme filme) {

		try {
			PreparedStatement ps = this.connection.prepareStatement("delete from filme where idFilme=?");

			ps.setInteger(1, filme.getIdfilme());
			ps.execute();
			ps.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	

	private Filme montarFilme(ResultSet rs) throws SQLException {

		Filme filme = new Filme();
		Filme.setTitulo(rs.getString("titulo"));
		Filme.setDuracao(rs.getInteger("duracao"));
		Filme.setAnoLancamento(rs.getInteger("anoLancamento"));
		Filme.setGenero(rs.getString("genero"));

		return filme;
	}

	public List<Filme> lista() {

		try {
			PreparedStatement ps = this.connection.prepareStatement("select * from filme");

			ResultSet rs = ps.executeQuery();

			List<Filme> lista = new ArrayList<Filme>();

			while (rs.next()) {
				Filme filme = montarFilme(rs);
				lista.add(filme);
			}

			ps.close();
			return lista;

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}