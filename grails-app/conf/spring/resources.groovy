import com.expense.tracker.UserPasswordEncoderListener
import com.expense.tracker.CustomUserDetailsService
// Place your Spring DSL code here
beans = {
    userPasswordEncoderListener(UserPasswordEncoderListener)
    userDetailsService(CustomUserDetailsService)
}
