package br.com.seteideias.hrworker.resources;

import br.com.seteideias.hrworker.entities.Worker;
import br.com.seteideias.hrworker.repositories.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/workers")
public class WorkerResource {
    @Autowired
    private WorkerRepository workerRepository;

    @GetMapping
    public ResponseEntity<List<Worker>> findAll(){
    return ResponseEntity.ok().body(workerRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Worker> findById(@PathVariable Long id){
        Optional<Worker> byId = workerRepository.findById(id);
        return ResponseEntity.ok(byId.get());
    }

}
