package tr.com.mcay.oopexapmle;

public class Car
{
    private String model = "";
    private float velocity = 0; //hız
    private int acceleration = 0; //ivme
    private float position = 0; // konum
    public Car(String model)
    {
        this.model = model;
    }
    // calculations has been simplified
    public void accelerate()
    {
        acceleration = 1;
        velocity += acceleration;
        position += velocity;
    }
    public void brake()
    {
        acceleration = -1;
        velocity += acceleration;
        if (velocity < 0)
            velocity = 0;
        position += velocity;
    }
    public float getVelocity()
    {
        return velocity;
    }
    public float getPosition()
    {
        return position;
    }
}
