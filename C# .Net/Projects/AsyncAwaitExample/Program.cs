using AsyncAwaitExample.Models;

namespace AsyncAwaitExample
{
    internal class Program
    {
        private static async Task Main(string[] args)
        {
            var customers = await GetAllCustomerAsync();
            Console.WriteLine("");
            var filteredCustomers = await FilteredCustomerAsync("Pune", customers);
            Console.WriteLine("");
            var flightCustomers = await FlightBookingAsync(filteredCustomers);
            Console.WriteLine("");
            var hotelCustomer = await HotelBookingAsync(filteredCustomers);
        }

        private static async Task<List<Customer>> GetAllCustomerAsync()
        {
            var allCustomer = new List<Customer>()
            {
                new Customer() { CustomerId = 1, CustomerName = "Swayam Terode", City = "Nagpur" },
                new Customer() { CustomerId = 2, CustomerName = "Ajay Sharma", City = "Pune" },
                new Customer() { CustomerId = 3, CustomerName = "Jay Adole", City = "Nagpur" },
                new Customer() { CustomerId = 4, CustomerName = "Pawan Bhagat", City = "Pune" },
                new Customer() { CustomerId = 5, CustomerName = "Justin Roy", City = "Kolkata" },
            };

            foreach (var item in allCustomer)
            {
                Console.WriteLine(
                    $"Customer Id: {item.CustomerId}, Customer Name: {item.CustomerName}, City: {item.City}");
            }

            // return await Task<List<Customer>>.Run(() => allCustomer);
            return await Task.Run(() => allCustomer);
        }

        private static async Task<List<Customer>> FilteredCustomerAsync(string cityTobeFiltered,
            List<Customer> customers)
        {
            var filteredCity = Task.Run(() => customers.Where(c => c.City != cityTobeFiltered).ToList());
            foreach (var item in filteredCity.Result)
            {
                Console.WriteLine(
                    $"Customer {item.CustomerName} from {item.City} is coming from the city {item.City} for the conference!");
            }

            return await filteredCity;
        }

        private static async Task<List<Customer>> FlightBookingAsync(List<Customer> customers)
        {
            foreach (var item in customers)
            {
                Console.WriteLine($"Flight has been booked for {item.CustomerName} from {item.City} to Pune");
            }

            return await Task.Run(() => customers);
        }

        private static async Task<List<Customer>> HotelBookingAsync(List<Customer> customers)
        {
            foreach (var item in customers)
            {
                Console.WriteLine($"Hotel has been booked for {item.CustomerName}");
            }

            return await Task.Run(() => customers);
        }
    }
}