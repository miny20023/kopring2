package mytest.kopring2.contoller

import mytest.kopring2.service.TestService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@CrossOrigin("http://localhost:3000", "http://114.205.236.79:3000")
@RestController
class firstContoller (
    @Autowired var testService: TestService,
    ) {

    @GetMapping("/singleData")
    fun getSingleData(): ResponseEntity<Any> {
        return ResponseEntity.ok(testService.getTest())
    }

    @GetMapping("/manyData")
    fun getManyData(): ResponseEntity<Any> {
        return ResponseEntity.ok(testService.getTestMany())
    }
}