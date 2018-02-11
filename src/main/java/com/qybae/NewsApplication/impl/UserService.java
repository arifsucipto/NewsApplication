package com.qybae.NewsApplication.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/*import com.qybae.NewsApplication.entity.PasswordResetToken;
import com.qybae.NewsApplication.entity.Plan;
import com.qybae.NewsApplication.service.PasswordResetTokenRepository;
import com.qybae.NewsApplication.service.PlanRepository;*/
import com.qybae.NewsApplication.service.RoleRepository;
import com.qybae.NewsApplication.service.UserRepository;
import com.qybae.NewsApplication.statics.PlansEnum;
import com.qybae.NewsApplication.entity.User;
import com.qybae.NewsApplication.entity.UserRole;

import java.util.Set;

/**
 * Created by tedonema on 30/03/2016.
 */
@Service
@Transactional(readOnly = true)
public class UserService {

    @Autowired
    private RoleRepository roleRepository;

/*    @Autowired
    private PlanRepository planRepository;*/

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    

    /** The application logger */
    private static final Logger LOG = LoggerFactory.getLogger(UserService.class);

    @Transactional
    public User createUser(User user, PlansEnum plansEnum, Set<UserRole> userRoles) {

        User localUser = (User) userRepository.findByEmail(user.getEmail());

        if (localUser != null) {
            LOG.info("User with username {} and email {} already exist. Nothing will be done. ",
                    user.getUsername(), user.getEmail());
        } else {

            String encryptedPassword = passwordEncoder.encode(user.getPassword());
            user.setPassword(encryptedPassword);

          /*  Plan plan = new Plan(plansEnum);
            // It makes sure the plans exist in the database
           if (!planRepository.exists(plansEnum.getId())) {
                plan = planRepository.save(plan);
            }
            user.setPlan(plan);*/

            for (UserRole ur : userRoles) {
                roleRepository.save(ur.getRole());
            }

            user.getUserRoles().addAll(userRoles);

            localUser = userRepository.save(user);

        }

        return localUser;

    }

    /**
     * Returns a user by username or null if a user could not be found.
     * @param username The username to be found
     * @return A user by username or null if a user could not be found.
     */
 


}