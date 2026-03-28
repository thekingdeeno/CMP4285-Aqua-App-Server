package com.example.aqua.pokemon_api;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class PokeService {

    private final RestClient restClient;

    public PokeService() {
        this.restClient = RestClient.builder()
                .baseUrl("https://pokeapi.co/api/v2")
                .build();
    }

    public Object getPokemon(String name) {
        return restClient.get()
                .uri("/pokemon/{name}", name)
                .retrieve()
                .body(Object.class);
    }

    public Object getPokemonList(int limit) {
        return restClient.get()
                .uri("/pokemon?limit={limit}", limit)
                .retrieve()
                .body(Object.class);
    }
}