package com.example.aqua.pokemon_api;

// import com.example.aqua.pokemon_api.PokeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pokemon")
public class PokeController {

    private final PokeService pokeService;

    public PokeController(PokeService pokeService) {
        this.pokeService = pokeService;
    }

    @GetMapping("/{name}")
    public ResponseEntity<Object> getPokemon(@PathVariable String name) {
        return ResponseEntity.ok(pokeService.getPokemon(name));
    }

    @GetMapping
    public ResponseEntity<Object> getPokemonList(@RequestParam(defaultValue = "10") int limit) {
        return ResponseEntity.ok(pokeService.getPokemonList(limit));
    }
}