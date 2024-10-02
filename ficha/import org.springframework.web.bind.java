import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class CharacterController {

    @PostMapping("/criar_ficha")
    public String criarFicha(
        @RequestParam String name,
        @RequestParam String classe,
        @RequestParam int level,
        @RequestParam int strength
        // Adicionar mais atributos
    ) {
        // Salvar ficha no banco de dados
        // Retornar uma mensagem de sucesso ou erro
        return "Ficha de " + name + " criada com sucesso!";
    }
}
