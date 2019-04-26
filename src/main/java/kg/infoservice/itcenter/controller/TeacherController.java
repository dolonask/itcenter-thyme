package kg.infoservice.itcenter.controller;

import kg.infoservice.itcenter.exception.MyResourceNotFoundException;
import kg.infoservice.itcenter.model.Teacher;
import kg.infoservice.itcenter.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/teacher/")
public class TeacherController {

    @Autowired
    private TeacherRepository teacherRepository;

    @RequestMapping(value = "all", method = RequestMethod.GET)
    public ResponseEntity<?> getAll(){
        List<Teacher> list = teacherRepository.findAllByActive(true);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @RequestMapping(value = "/save/", method = RequestMethod.POST)
    public ResponseEntity<?> save(@RequestBody Teacher teacher){

        teacher = teacherRepository.save(teacher);
        return new ResponseEntity<>(teacher, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.PUT)
    public ResponseEntity<?> edit(@PathVariable int id, @RequestBody Teacher teacher){

        if (!teacherRepository.existsById(id)){
            throw  new MyResourceNotFoundException();
        }

        teacher = teacherRepository.save(teacher);
        return new ResponseEntity<>(teacher, HttpStatus.OK);
    }




}
