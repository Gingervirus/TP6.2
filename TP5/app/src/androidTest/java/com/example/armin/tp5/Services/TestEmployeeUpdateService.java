package com.example.armin.tp5.Services;

import com.example.armin.tp5.services.Employee.UpdateEmployeeService;

/**
 * Created by Armin on 2016-05-08.
 */
public class TestEmployeeUpdateService {
    UpdateEmployeeService updateService;
    boolean isBound = false;
    /*
    @Test
    public void testWithBoundService() throws TimeoutException {
        // Create the service Intent.
        Intent serviceIntent =
                new Intent(InstrumentationRegistry.getTargetContext(),
                        UpdateStudentService.class);

        // Data can be passed to the service via the Intent.
        serviceIntent.putExtra(UpdateStudentService.SEED_KEY, 42L);

        // Bind the service and grab a reference to the binder.
        IBinder binder = mServiceRule.bindService(serviceIntent);

        // Get the reference to the service, or you can call
        // public methods on the binder directly.
        UpdateStudentService service =
                ((UpdateStudentService.MyLocalBinder) binder).getService();

        // Verify that the service is working correctly.
        Assert.assert(service.updateEmployee(emp), is(any(Integer.class)));
    }

   */

}
