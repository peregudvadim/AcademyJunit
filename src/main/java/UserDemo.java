//created by Vadim Peregud

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.LocalDate;

public class UserDemo {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        User user = new User("Vadim", "Peregud", 45, LocalDate.of(1978, 07, 05),
                "Login", "Password", "vadimperegud@yandex.ru");

        user.printUserInfo();
        Class<?> userClass = user.getClass();


        Method method1 = userClass.getMethod("printUserInfo");
        Method method2 = userClass.getMethod("setPassword", String.class);
        System.out.println(method1);
        System.out.println(method2);
        System.out.println("===============================");

        Method[] methods = userClass.getMethods();
        for (Method method : methods) {
            System.out.println("Method: " + method);
        }
        Field field = userClass.getField("firstName");
        System.out.println("Field: " + field);
        try {
            Field field2 = userClass.getField("password");
            System.out.println("Field2: " + field2);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

        Field[] fields = userClass.getFields();
        for (Field f : fields) {
            System.out.println("Field: " + f);
        }

        System.out.println("=============================");
        try {
            Method declaredMethod = userClass.getDeclaredMethod("getPassword");
            System.out.println("Declared Method: " + declaredMethod);

            Method[] declaredMethods = userClass.getDeclaredMethods();
            for (Method method : declaredMethods) {
                System.out.println("Declared Methods: " + method);
            }

            Field declaredField = userClass.getDeclaredField("email");
            System.out.println("Declared Field: " + declaredField);

            Field[] declaredFields = userClass.getDeclaredFields();
            for (Field f : declaredFields) {
                System.out.println("Declared Field: " + f);
            }

        } catch (NoSuchMethodException | NoSuchFieldException e) {
            e.printStackTrace();
        }
        System.out.println("=============================");
        Field emailField = userClass.getDeclaredField("email");
        emailField.setAccessible(true);
        emailField.set(user, "Peregudvadim@yandex.ru");
        user.printUserInfo();
        System.out.println("=============================");
        Method methodToString = userClass.getDeclaredMethod("toString");
        System.out.println(methodToString.invoke(user));

    }

}

