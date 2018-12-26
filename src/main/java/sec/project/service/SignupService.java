package sec.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sec.project.repository.SignupRepository;

@Service
public class SignupService {

    @Autowired
    private SignupRepository signupRepository;

}