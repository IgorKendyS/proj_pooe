package projeto;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import com.projeto.model.models.Usuario;
import com.projeto.model.service.UsuarioService;

public class UsuarioTest {
	
	//@Test(expected = Exception.class)
	public void salverUsuarioBancoDadosTeste() {

		Usuario usuario = new Usuario();
		
		//usuario.setId(1);
		usuario.setUsername("Jõao Carlos da Silva");
		usuario.setPassword("123459");
		usuario.setEmail("joãoo@carlos.silva.com.br");
		usuario.setAtivo(false);
		usuario.setAdmin(false);
		
		UsuarioService usuarioService = new UsuarioService();
		usuarioService.save(usuario);
		

		/*Usuario usuario2 = new Usuario();
		
		//usuario.setId(1);
		usuario.setUsername("Maria Clara");
		usuario.setPassword("895479");
		usuario.setEmail("MarClara@end.com.br");
		usuario.setAtivo(false);
		usuario.setAdmin(false);
		
		UsuarioService usuarioService2 = new UsuarioService();
		usuarioService2.save(usuario);*/
		
		/*usuario = usuarioService.findById(usuario.getId());
		
		System.out.println(usuario.toString());
		
		usuario.setEmail("roberto@carlos.com");
		
		usuarioService.update(usuario);
		
		System.out.println("Alteração usuário no banco de dados");*/
		
		//assertTrue(true);
		
	}
	
	//@Test(expected = Exception.class)
	public void listarTodosUsuarioTabelaUsuario() {
		
		UsuarioService usuarioService = new UsuarioService();
		
		List<Usuario> listaUsuario = usuarioService.findAll();
		
		for(Usuario usuario : listaUsuario) {
			System.out.println(usuario.toString());
		}
	}
	
	@Test(expected = Exception.class)
	public void excluirUsuarioDaTabela() {
		Usuario usuario = new Usuario();
		
		usuario.setId(3);
		
		UsuarioService usuarioService = new UsuarioService();
		usuarioService.delete(usuario);
	}
}
